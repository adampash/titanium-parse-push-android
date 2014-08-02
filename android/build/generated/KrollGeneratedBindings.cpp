/* C++ code produced by gperf version 3.0.3 */
/* Command-line: /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/gperf -L C++ -E -t /private/var/folders/n_/q429sxl55vx2pnx_1d7j0f_w0000gn/T/ap/parsepushandroid-generated/KrollGeneratedBindings.gperf  */
/* Computed positions: -k'' */

#line 3 "/private/var/folders/n_/q429sxl55vx2pnx_1d7j0f_w0000gn/T/ap/parsepushandroid-generated/KrollGeneratedBindings.gperf"


#include <string.h>
#include <v8.h>
#include <KrollBindings.h>

#include "com.adampash.parsepushandroid.ExampleProxy.h"
#include "com.adampash.parsepushandroid.ParsepushandroidModule.h"


#line 14 "/private/var/folders/n_/q429sxl55vx2pnx_1d7j0f_w0000gn/T/ap/parsepushandroid-generated/KrollGeneratedBindings.gperf"
struct titanium::bindings::BindEntry;
/* maximum key range = 11, duplicates = 0 */

class ParsepushandroidBindings
{
private:
  static inline unsigned int hash (const char *str, unsigned int len);
public:
  static struct titanium::bindings::BindEntry *lookupGeneratedInit (const char *str, unsigned int len);
};

inline /*ARGSUSED*/
unsigned int
ParsepushandroidBindings::hash (register const char *str, register unsigned int len)
{
  return len;
}

struct titanium::bindings::BindEntry *
ParsepushandroidBindings::lookupGeneratedInit (register const char *str, register unsigned int len)
{
  enum
    {
      TOTAL_KEYWORDS = 2,
      MIN_WORD_LENGTH = 42,
      MAX_WORD_LENGTH = 52,
      MIN_HASH_VALUE = 42,
      MAX_HASH_VALUE = 52
    };

  static struct titanium::bindings::BindEntry wordlist[] =
    {
      {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""},
      {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""},
      {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""},
      {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""},
      {""}, {""}, {""}, {""}, {""}, {""},
#line 16 "/private/var/folders/n_/q429sxl55vx2pnx_1d7j0f_w0000gn/T/ap/parsepushandroid-generated/KrollGeneratedBindings.gperf"
      {"com.adampash.parsepushandroid.ExampleProxy", ::com::adampash::parsepushandroid::parsepushandroid::ExampleProxy::bindProxy, ::com::adampash::parsepushandroid::parsepushandroid::ExampleProxy::dispose},
      {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""},
#line 17 "/private/var/folders/n_/q429sxl55vx2pnx_1d7j0f_w0000gn/T/ap/parsepushandroid-generated/KrollGeneratedBindings.gperf"
      {"com.adampash.parsepushandroid.ParsepushandroidModule", ::com::adampash::parsepushandroid::ParsepushandroidModule::bindProxy, ::com::adampash::parsepushandroid::ParsepushandroidModule::dispose}
    };

  if (len <= MAX_WORD_LENGTH && len >= MIN_WORD_LENGTH)
    {
      register int key = hash (str, len);

      if (key <= MAX_HASH_VALUE && key >= 0)
        {
          register const char *s = wordlist[key].name;

          if (*str == *s && !strcmp (str + 1, s + 1))
            return &wordlist[key];
        }
    }
  return 0;
}
#line 18 "/private/var/folders/n_/q429sxl55vx2pnx_1d7j0f_w0000gn/T/ap/parsepushandroid-generated/KrollGeneratedBindings.gperf"

