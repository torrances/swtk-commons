package org.swtk.commons.dict.wordnet.indexbyname.instance.e.x.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEXH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"exhalation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00836928\", \"14866261\"]}");
	add("{\"term\":\"exhaust\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03307883\", \"14861534\"]}");
	add("{\"term\":\"exhaust fan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03308162\"]}");
	add("{\"term\":\"exhaust fumes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14861534\"]}");
	add("{\"term\":\"exhaust hood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03536726\"]}");
	add("{\"term\":\"exhaust manifold\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03308278\"]}");
	add("{\"term\":\"exhaust pipe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03308455\"]}");
	add("{\"term\":\"exhaust system\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03307883\"]}");
	add("{\"term\":\"exhaust valve\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03308614\"]}");
	add("{\"term\":\"exhaustion\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00357447\", \"07345810\", \"14040677\"]}");
	add("{\"term\":\"exhibit\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00522265\", \"06747071\"]}");
	add("{\"term\":\"exhibition\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08424576\", \"00523201\"]}");
	add("{\"term\":\"exhibition area\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03308776\"]}");
	add("{\"term\":\"exhibition game\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00457923\"]}");
	add("{\"term\":\"exhibition hall\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03308776\"]}");
	add("{\"term\":\"exhibition season\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15265530\"]}");
	add("{\"term\":\"exhibitioner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10090370\"]}");
	add("{\"term\":\"exhibitionism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00739192\", \"06902751\"]}");
	add("{\"term\":\"exhibitionist\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10090518\", \"10090749\"]}");
	add("{\"term\":\"exhibitor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10090370\"]}");
	add("{\"term\":\"exhilaration\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07543600\"]}");
	add("{\"term\":\"exhortation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07260696\", \"07154408\"]}");
	add("{\"term\":\"exhumation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00045638\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }