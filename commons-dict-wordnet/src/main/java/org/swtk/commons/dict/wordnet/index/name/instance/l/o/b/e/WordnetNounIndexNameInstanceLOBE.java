package org.swtk.commons.dict.wordnet.index.name.instance.l.o.b.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLOBE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lobe\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03686060\", \"07018639\", \"13182404\", \"05500955\"]}");
	add("{\"term\":\"lobectomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00684843\"]}");
	add("{\"term\":\"lobefin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02517845\"]}");
	add("{\"term\":\"lobelia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12189082\"]}");
	add("{\"term\":\"lobeliaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12188643\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }