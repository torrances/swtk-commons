package org.swtk.commons.dict.wiktionary.generated.c.u.c;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryCUC000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("cuckold", "{\"term\":\"cuckold\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"middle english (1100-1500)\", \"frankish\", \"old french (842-ca. 1400)\", \"Latin\"], \"text\":\"Derived from Old french (842-ca. 1400) \u0027cucuault\u0027 a compound of \u0027cucu\u0027 (cuckoo) (some varieties of the cuckoo bird lay their eggs in another’s nest) and Old french (842-ca. 1400) \u0027-auld\u0027 \u0027Cucu\u0027 is either a directly derived onomatopoeic derivative of the {{m|en|cuckoo}}\u0027s call, or from Latin {{m|la|cuculus}}. Latin {{m|la|cuculus}} is a compound of onomatopoeic {{m|la|cucu}} (compare {{m|la|cucus}}) and the diminutive suffix {{m|la|-ulus}}. \u0027-auld\u0027 is from Frankish {{m|frk|*-wald}} (similar suffixes are used in some personal names within other Germanic languages as well; confer English {{m|en|Harold}}, for instance), a suffixal note of Frankish \u0027*wald\u0027 (power, mastery, dominion) from Proto-germanic {{m|gem-pro|*waldą||might, power, authority}}, from {{m|gem-pro|*waldaną||to rule}}, from Proto-indo-european {{m|ine-pro|*wal-||to be strong}}. Appears in Middle english (1100-1500) in noun form circa 1250 as \u0027cokewald\u0027 First known use of the verb form is 1589.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A man married to an unfaithful wife, especially when he is unaware or unaccepting of the fact\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1546\u0027\u0027, \u0027The Third Book\u0027, Chapter 3\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"If I never marry, I shall never be a \u0027\u0027cuckold\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A West Indian plectognath fish\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"The cowfish, and allied species\", \"priority\":5}]}, \"synonyms\":{}}");

	add("cuckquean", "{\"term\":\"cuckquean\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{compound|cuckold|quean|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A woman who has an unfaithful husband\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"title\u003dThe Proverbs and Epigrams of John Heywood (A.D. 1562) pageurl\u003dhttp://books.google.com/books?id\u003d3ugWMhRUEm8C\u0026amp;lpg\u003dPA62\u0026amp;ots\u003d0G9QSCl0iF\u0026amp;dq\u003djohn%20heywood%20Proverbs%20%26%20Epigrams%20%20Ye%20make%20hir%20a%20cookqueane.\u0026amp;pg\u003dPA6\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"v\u003donepage\u0026amp;q\u003dcookqueane\u0026amp;f\u003dfalse publisher\u003dSpenser Society page\u003d62 passage\u003dYe make hir a cookqueane\", \"priority\":3}]}, \"synonyms\":{}}");

	add("cucumber", "{\"term\":\"cucumber\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"old french (842-ca. 1400)\", \"Latin\"], \"text\":\"From Old french (842-ca. 1400) \u0027cocombre\u0027 (French \u0027concombre\u0027 , from Latin \u0027cucumis\u0027 whose ablative singular is \u0027cucumere\u0027 Probably of Pre-Italic origin.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A vine in the gourd family, \u0027Cucumis sativus\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The edible fruit of this plant, having a green rind and crisp white flesh\", \"priority\":2}]}, \"synonyms\":{\"list\":[{\"text\":\"cuke\", \"synonymQualifier\":\"INFORMAL\"}]}}");

	add("cucurbitane", "{\"term\":\"cucurbitane\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An isomer of lanostane\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }