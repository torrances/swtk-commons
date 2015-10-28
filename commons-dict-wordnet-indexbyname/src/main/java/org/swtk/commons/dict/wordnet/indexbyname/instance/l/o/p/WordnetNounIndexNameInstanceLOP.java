package org.swtk.commons.dict.wordnet.indexbyname.instance.l.o.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLOP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lope\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00289330\", \"00295034\"]}");
	add("{\"term\":\"lophiidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02550578\"]}");
	add("{\"term\":\"lophius\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02550759\"]}");
	add("{\"term\":\"lophodytes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01857984\"]}");
	add("{\"term\":\"lopholatilus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02575706\"]}");
	add("{\"term\":\"lophophora\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11869486\"]}");
	add("{\"term\":\"lophophorus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01807840\"]}");
	add("{\"term\":\"lophosoria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13224303\"]}");
	add("{\"term\":\"lophosoriaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13224149\"]}");
	add("{\"term\":\"lopid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03437989\"]}");
	add("{\"term\":\"lopper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04022634\"]}");
	add("{\"term\":\"lopressor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03762386\"]}");
	add("{\"term\":\"lopsidedness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05073364\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }