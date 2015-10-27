package org.swtk.commons.dict.wordnet.index.name.instance.h.o.r.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHORN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"horn\", \"synsetCount\":11, \"upperType\":\"NOUN\", \"ids\":[\"02764839\", \"03399752\", \"03541941\", \"03542421\", \"14782206\", \"01328494\", \"03115320\", \"03542111\", \"07280214\", \"01328058\", \"03542265\"]}");
	add("{\"term\":\"hornbeam\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12307343\"]}");
	add("{\"term\":\"hornbill\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01832054\"]}");
	add("{\"term\":\"hornblende\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14750303\"]}");
	add("{\"term\":\"hornbook\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06433181\"]}");
	add("{\"term\":\"horne\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11080530\", \"11080683\"]}");
	add("{\"term\":\"horneophyton\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13239402\"]}");
	add("{\"term\":\"hornet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02215759\"]}");
	add("{\"term\":\"horney\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11080800\"]}");
	add("{\"term\":\"hornfels\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14723229\"]}");
	add("{\"term\":\"horniness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14061509\"]}");
	add("{\"term\":\"hornist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10205102\"]}");
	add("{\"term\":\"hornpipe\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03542731\", \"07069760\", \"00539913\"]}");
	add("{\"term\":\"hornpout\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02521971\"]}");
	add("{\"term\":\"hornstone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14723229\"]}");
	add("{\"term\":\"hornwort\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11559271\", \"11722721\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }