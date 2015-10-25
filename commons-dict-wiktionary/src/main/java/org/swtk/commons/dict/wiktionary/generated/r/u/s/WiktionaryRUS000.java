package org.swtk.commons.dict.wiktionary.generated.r.u.s;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryRUS000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("ruscism", "{\"term\":\"ruscism\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{blend|Russian|fascism|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A popular unofficial name for the political ideology and social practice of the Russian ruling regime at the beginning of the 21st century\", \"priority\":1}]}, \"synonyms\":{}}");

	add("rushes", "{\"term\":\"rushes\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Unedited footage; film material as recorded to tape etc\", \"priority\":1}]}, \"synonyms\":{}}");

	add("russian", "{\"term\":\"russian\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"old russian\"], \"text\":\"(11th century) {{m|la|Russianus}}, the adjective of {{m|la|Russia}}, a Latinization of the Old russian {{m|orv|Русь}}. Attested in English (both as a noun and as an adjective) from the 16th century.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A person from Russia\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"An ethnic Russian: a member of the East Slavic ethnic group which is native to, and constitutes the majority of the population of, Russia\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A domestic cat breed\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A cat of this breed\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"A type of juggling ball with a hard outer shell, filled with salt, sand or another similar substance. been juggling bags and then start juggling \u0027\u0027Russians\u0027\u0027, they feel sooo lopsided to juggle at year\u003d2011|prefix\", \"priority\":5}]}, \"synonyms\":{}}");

	add("russianism", "{\"term\":\"russianism\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Russian|ism|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A word or other feature originating in the Russian language that has been borrowed by another language\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Nationalistic ideology declaring being Russian the highest value\", \"priority\":2}]}, \"synonyms\":{}}");

	add("russianness", "{\"term\":\"russianness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|Russian|ness|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The quality or characteristic of being Russian\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2011\u0027\u0027, \u0027Is That a Fish in Your Ear?\u0027, Penguin 2012, p. 47\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"What could represent ‘\u0027\u0027Russianness\u0027\u0027’ or ‘Germanness’ inside a work written in English\", \"priority\":3}]}, \"synonyms\":{}}");

	add("russification", "{\"term\":\"russification\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From \u0027\u0027 from \u0027\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A policy that enforces traditional Russian values either domestically or internationall\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Enabling a computer to work with the Russian Cyrillic alphabet\", \"priority\":2}]}, \"synonyms\":{}}");

	add("russophile", "{\"term\":\"russophile\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|Russo|phile|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A person who loves the country, culture or people of Russia\", \"priority\":1}]}, \"synonyms\":{}}");

	add("russophilia", "{\"term\":\"russophilia\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{confix|Russo|philia|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a strong interest in the country, culture, or people of Russian\", \"priority\":1}]}, \"synonyms\":{}}");

	add("russophobe", "{\"term\":\"russophobe\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{confix|Russo|phobe|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Someone who fears or hates Russians or Russian influence\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1990\u0027\u0027, \u0027The Great Game\u0027, Folio Society 2010, p. 7\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"For the most part these commentators and critics were \u0027\u0027Russophobes\u0027\u0027 of strongly hawkish views\", \"priority\":3}]}, \"synonyms\":{}}");

	add("rusticity", "{\"term\":\"rusticity\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|rustic|ity|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"That which makes something rustic\", \"priority\":1}]}, \"synonyms\":{}}");

	add("rustle", "{\"term\":\"rustle\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A soft crackling sound similar to the movement of leaves\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1994\u0027\u0027, \u0027\u0027 Chapter\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"He heard the silken \u0027\u0027rustle\u0027\u0027 of a dressing-gown being drawn on\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }