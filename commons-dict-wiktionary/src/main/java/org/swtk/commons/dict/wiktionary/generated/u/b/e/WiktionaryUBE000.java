package org.swtk.commons.dict.wiktionary.generated.u.b.e;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryUBE000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("uberdork", "{\"term\":\"uberdork\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|uber|dork|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An extremely dorky or geekish perso\", \"priority\":1}]}, \"synonyms\":{}}");

	add("uberfan", "{\"term\":\"uberfan\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|uber|fan|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An extremely enthusiastic fan\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2006\u0027\u0027, Andrew Putz, \u0026quot;The Eight Annual Airball Awards\u0026quot;, \u0027Indianapolis Monthly\u0027, January 2006, [http://books.google.com/books?id\u003dPusCAAAAMBAJ\u0026amp;pg\u003dPA130\u0026amp;dq\u003d%22uberfan%22 page 130\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Asked what he liked about Reggie Miller, Knicks \u0027\u0027uberfan\u0027\u0027 and Miller foil Spike Lee told \u0027The New York Times\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2004\u0027\u0027, Chris Handyside, \u0027Fell in Love with a Band: The Story of the White Stripes\u0027, St. Martins Press (2004), ISBN 9780312336189, [http://books.google.com/books?id\u003dYS4wAAAAQBAJ\u0026amp;pg\u003dPA209\u0026amp;dq\u003d%22uberfans%22 page 209\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Between the specially packaged, vinyl-only review copies that were seeded out to influential press that winter (including bloggers and gushy \u0027\u0027uberfans\u0027\u0027, as well as the usual glossy rag tastemakers and industry-friendly hacks\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"2007\u0027\u0027, Dave Fanning, \u0026quot;Forward\u0026quot;, in Višnja Cogan, \u0027U2: An Irish Phenomenon\u0027, Pegasus Books (2008), ISBN 9781933648712, [http://books.google.com/books?id\u003drX-MI9m1ExsC\u0026amp;pg\u003dPP12\u0026amp;dq\u003d%22uberfan%22 page x\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"the one constant which pops up so charmingly every-so-often is that Visnja is an unapologetic U2 \u0027\u0027uberfan\", \"priority\":7}]}, \"synonyms\":{}}");

	add("ubergeek", "{\"term\":\"ubergeek\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|uber|geek|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A highly proficient geek\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }