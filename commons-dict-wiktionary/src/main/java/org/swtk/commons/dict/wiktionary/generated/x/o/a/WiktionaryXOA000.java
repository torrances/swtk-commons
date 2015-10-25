package org.swtk.commons.dict.wiktionary.generated.x.o.a;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryXOA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("xoanon", "{\"term\":\"xoanon\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From Ancient greek (to 1453) \u0027ξόανον\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A wooden statue used as a cult image in Ancient Greece\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1913\u0027\u0027, E. A. Gardner, \u0026quot;Reviews: Catalogue of the Acropolis Museum\u0026quot;, \u0027The Classical Review\u0027, \u0027\u002727\u0027\u0027, page 19\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"In the case of 679, the well-known female figure of \u0027\u0027xoanon\u0027\u0027 shape, it is often asserted that we see a more or less archaistic survival\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"1993\u0027\u0027, Joan V. O\u0027Brien, \u0027The Transformation of Hera: A Study of Ritual, Hero, and the Goddess in the\u0027 Iliad, page 1\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Callimachus\u0027 description of the Samian \u0027\u0027\u0027xoanon\u0027\u0027\u0027 as a \u0027sanis\u0027—a flat board or plank regularly used for doors or wooden tablets—and specifically as \u0026quot;not carved by chisels\u0026quot; (\u0027gluphanôn axoos sanis\u0027) clearly indicates an aniconic Hera of Samos\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"2009\u0027\u0027, Peter Wilson, \u0026quot;Thamyris the Thracian: the archetypal wandering poet?\u0026quot;, \u0027in\u0027 Richard Hunter \u0026amp; ‎Ian Rutherford (editors), \u0027Wandering Poets in Ancient Greek Culture\u0027, page 7\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"On Carlo Brillante\u0027s convincing interpretation, Thamyras is here attempting not simply to display his musical virtuosity, but to animate with his song this chorus of nine female \u0027\u0027\u0027xoana\u0027\u0027\u0027, his own personal substitutes for the nine real Muses\", \"priority\":7}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }