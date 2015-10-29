package org.swtk.commons.dict.wordnet.indexbyname.instance.l.o.x;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLOX {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lox\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07812726\", \"14672704\"]}");
	add("{\"term\":\"loxapine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03699816\"]}");
	add("{\"term\":\"loxia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01536421\"]}");
	add("{\"term\":\"loxia curvirostra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01536534\"]}");
	add("{\"term\":\"loxitane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03699816\"]}");
	add("{\"term\":\"loxodonta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02506954\"]}");
	add("{\"term\":\"loxodonta africana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02507089\"]}");
	add("{\"term\":\"loxodrome\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08650253\"]}");
	add("{\"term\":\"loxoma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13224606\"]}");
	add("{\"term\":\"loxomataceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13224449\"]}");
	add("{\"term\":\"loxostege\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02311504\"]}");
	add("{\"term\":\"loxostege similalis\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02311650\", \"02311772\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }