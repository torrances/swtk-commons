package org.swtk.commons.dict.wordnet.indexbyname.instance.b.u.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBUG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bug\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"01387132\", \"02239548\", \"02915786\", \"14488259\", \"02239007\"]}");
	add("{\"term\":\"bugaboo\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05840945\", \"09511247\"]}");
	add("{\"term\":\"buganda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09065886\"]}");
	add("{\"term\":\"bugbane\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11748999\", \"12485154\"]}");
	add("{\"term\":\"bugbear\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05819688\", \"09511247\"]}");
	add("{\"term\":\"bugger\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10640876\"]}");
	add("{\"term\":\"buggery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00850924\"]}");
	add("{\"term\":\"bugginess\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14496110\"]}");
	add("{\"term\":\"buggy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02915903\"]}");
	add("{\"term\":\"bugle\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02916381\", \"12861509\", \"02916240\"]}");
	add("{\"term\":\"bugler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09897645\"]}");
	add("{\"term\":\"bugleweed\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12861509\", \"12872994\"]}");
	add("{\"term\":\"bugloss\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12023636\", \"12838454\"]}");
	add("{\"term\":\"bugologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10079712\"]}");
	add("{\"term\":\"bugology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06081825\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }