package org.swtk.commons.dict.wiktionary.generated.e.i.d;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryEID000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("eider", "{\"term\":\"eider\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Icelandic\", \"Swedish\"], \"text\":\"From Icelandic \u0027æðar\u0027, genitive of \u0027æðr\u0027, probably reaching English via Swedish Swedish|eider\u0027 (now \u0027ejder\u0027), from a North Germanic root.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of the species of the genera \u0027Polysticta\u0027 or \u0027Somateria\u0027, in the seaduck subfamily Merginae, which line their nests with fine down (taken from their own bodies\", \"priority\":1}]}, \"synonyms\":{}}");

	add("eider", "{\"term\":\"eider\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A river in Germany, the boundary between Schleswig and Holstein\", \"priority\":1}]}, \"synonyms\":{}}");

	add("eidolon", "{\"term\":\"eidolon\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From Ancient greek (to 1453) \u0027εἴδωλον\u0027 (figure, representation) from \u0027εἶδος\u0027 (sight) from \u0027εἴδω\u0027 (i see)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An image or representation of an idea; a representation of an ideal form; an apparition of some actual or imaginary entity, or of some aspect of reality\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1936\u0027\u0027, \u0027Black Spring\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"As a species it is extinct; as an \u0027\u0027eidolon\u0027\u0027 it retains its corporeality – but only if maintained in a state of equipoise\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"1974\u0027\u0027, \u0027Monsieur\u0027, Faber \u0026amp; Faber 1992, p. 21\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"It was not hard to forge her image, her \u0026quot;\u0027\u0027eidolon\u0027\u0027\u0026quot;, in the grey gloom of the little church\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"2006\u0027\u0027, \u0027Against the Day\u0027, Vintage 2007, p. 697\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"Kit was sitting up staring into the dark at this \u0027\u0027eidolon\u0027\u0027, inelegantly turned out contrary to a whole raft of public-decency statutes, which had come monitory and breathing in to violate Kit\u0027s insomnia\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"A phantom, a ghost or elusive entity\", \"priority\":8}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }