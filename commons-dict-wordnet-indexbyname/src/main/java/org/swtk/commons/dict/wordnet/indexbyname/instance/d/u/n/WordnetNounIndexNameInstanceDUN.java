package org.swtk.commons.dict.wordnet.indexbyname.instance.d.u.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDUN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"dun\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04980377\", \"02383913\"]}");
	add("{\"term\":\"duncan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10965407\"]}");
	add("{\"term\":\"dunce\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10059388\"]}");
	add("{\"term\":\"dunderhead\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10059388\"]}");
	add("{\"term\":\"dune\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09293641\"]}");
	add("{\"term\":\"dung\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14878998\"]}");
	add("{\"term\":\"dungaree\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03179855\"]}");
	add("{\"term\":\"dungeon\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03261631\", \"03615311\"]}");
	add("{\"term\":\"dunghill\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07978909\", \"14519564\"]}");
	add("{\"term\":\"dunk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00111374\"]}");
	add("{\"term\":\"dunkard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09697226\"]}");
	add("{\"term\":\"dunker\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09697226\", \"10059743\", \"10059846\"]}");
	add("{\"term\":\"dunkerque\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01280431\", \"08955751\"]}");
	add("{\"term\":\"dunkers\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08107513\"]}");
	add("{\"term\":\"dunkirk\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01280431\", \"08955751\", \"14056350\"]}");
	add("{\"term\":\"dunlin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02030146\"]}");
	add("{\"term\":\"dunnock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01529988\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }