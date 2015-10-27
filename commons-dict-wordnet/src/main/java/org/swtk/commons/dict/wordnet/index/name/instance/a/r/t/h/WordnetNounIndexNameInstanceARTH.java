package org.swtk.commons.dict.wordnet.index.name.instance.a.r.t.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceARTH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"arthralgia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14347981\"]}");
	add("{\"term\":\"arthritic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09830973\"]}");
	add("{\"term\":\"arthritis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14210023\"]}");
	add("{\"term\":\"arthrocentesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00945677\"]}");
	add("{\"term\":\"arthrodesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00667843\"]}");
	add("{\"term\":\"arthrogram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02747849\"]}");
	add("{\"term\":\"arthrography\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00907540\"]}");
	add("{\"term\":\"arthromere\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05232732\"]}");
	add("{\"term\":\"arthropathy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14047767\"]}");
	add("{\"term\":\"arthroplasty\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00667976\"]}");
	add("{\"term\":\"arthropod\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01770302\"]}");
	add("{\"term\":\"arthropoda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01769840\"]}");
	add("{\"term\":\"arthropteris\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13225380\"]}");
	add("{\"term\":\"arthroscope\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02747966\"]}");
	add("{\"term\":\"arthroscopy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00668127\"]}");
	add("{\"term\":\"arthrospore\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13113144\", \"13113307\"]}");
	add("{\"term\":\"arthur\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10844492\", \"10844784\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }