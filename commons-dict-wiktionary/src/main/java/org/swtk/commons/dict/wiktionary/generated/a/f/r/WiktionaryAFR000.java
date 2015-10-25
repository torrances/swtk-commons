package org.swtk.commons.dict.wiktionary.generated.a.f.r;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryAFR000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("afro", "{\"term\":\"afro\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Finnish\"], \"text\":\"From English \u0027afro\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A hairstyle characterized by a tightly curled locks and a rounded shape\", \"priority\":1}]}, \"synonyms\":{}}");

	add("africa", "{\"term\":\"africa\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\", \"punic\"], \"text\":\"{{wikipedia|Africa (etymology)}}From Latin {{m|la|Āfrica}}, from {{m|la|Āfer||inhabitant of the w:Ancient Carthage|country of Carthage}}, probably from a Punic term for the w:Ancient Carthage|country of Carthage of unknown origin.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A province of the Roman Empire containing what is now modern Tunisia and portions of Libya\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The continent that is south of Europe, east of the Atlantic Ocean, west of the Indian Ocean and north of Antarctica. It holds the following countries\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The Maghreb and the Subsahara are regions of \u0027\u0027Africa\u0027\u0027 with different geographies\", \"priority\":3}]}, \"synonyms\":{}}");

	add("africana", "{\"term\":\"africana\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"From Latin {{m|la|āfricāna}}, the neuter plural of {{m|la|āfricānus||African}}. Surface analysis {{suffix|Africa|ana|t2\u003dthings (plural)|lang\u003den}}, analogous to {{m|en|Americana}}. First attested in 1908.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Collectible objects, such as maps, documents and artifacts, peculiar to Africa, especially Southern Africa\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Africana is a word of many different meanings; to one it means books and other printed or manuscript material, to another it means objects other than books. For \u0027Africana Notes and News\u0027 it is used in its widest sense ... it is restricted only from a geographical point of view; it denotes not the whole of Africa but only Southern Africa. \u0027 (Africana Notes \u0026amp; News, 1943\", \"priority\":2}]}, \"synonyms\":{}}");

	add("africanization", "{\"term\":\"africanization\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The act or process of Africanizing\", \"priority\":1}]}, \"synonyms\":{}}");

	add("africanness", "{\"term\":\"africanness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state or quality of being African\", \"priority\":1}]}, \"synonyms\":{}}");

	add("africology", "{\"term\":\"africology\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An interdisciplinary academic discipline that studies the culture of Africans and the African diaspora\", \"priority\":1}]}, \"synonyms\":{}}");

	add("afrobeat", "{\"term\":\"afrobeat\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|Afro|beat|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A fusion of jazz and funk from Nigeria\", \"priority\":1}]}, \"synonyms\":{}}");

	add("afrocentrism", "{\"term\":\"afrocentrism\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Afro- + -centrism. The adjective Afrocentric dates to the early 1960s; \u0026quot;Afrocentrism\u0026quot; is attested from the late 1960s or early 1970s, both in the context of the civil rights movement and black nationalism in the United States.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Black African ethnocentrism\", \"priority\":1}]}, \"synonyms\":{}}");

	add("afrophobia", "{\"term\":\"afrophobia\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From Afro- + -phobia\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Fear, hate, or dislike of Black Africans and Black African descendant\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1986\u0027\u0027, Carlton W. Molette, Barbara J. Molette, \u0027Black Theatre: premise and presentation\u0027, page 3\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Individuals who suffer from \u0027\u0027Afrophobia\u0027\u0027 often avoid facing this fear by ignoring Africa, its culture, and its people\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"1998\u0027\u0027 (Mar 30), Christopher Ogden, \u0026quot;Good Will Bill\u0026quot;, \u0027Time\u0027 \u0027\u0027151\u0027\u0027 (13) [http://web.archive.org/web/20000816215306/http://www.time.com/time/magazine/1998/int/980330/africa.good_will_bill.at20.html\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"The Somalia debacle prompted a fresh bout of \u0027\u0027Afrophobia\u0027\u0027 in Washington\", \"priority\":5}]}, \"synonyms\":{}}");

	add("afropop", "{\"term\":\"afropop\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|Afro|pop|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The pop music of Africa\", \"priority\":1}]}, \"synonyms\":{}}");

	add("afrormosia", "{\"term\":\"afrormosia\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of the African leguminous trees of the genus \u0027Pericopsis\u0027 (formerly ), especially ; the timber of these trees\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }