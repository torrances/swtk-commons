package org.swtk.commons.dict.wordnet.index.name.instance.d.i.f.f;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDIFF {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"difference\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"13751346\", \"13881504\", \"07196595\", \"07380889\", \"04756076\"]}");
	add("{\"term\":\"differentia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04756661\"]}");
	add("{\"term\":\"differential\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03198981\", \"04756532\", \"06024079\"]}");
	add("{\"term\":\"differentiation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"13580985\", \"00872318\", \"05756230\"]}");
	add("{\"term\":\"differentiator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10032560\"]}");
	add("{\"term\":\"difficultness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04716529\"]}");
	add("{\"term\":\"difficulty\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04716529\", \"14431490\", \"05694760\", \"00625102\"]}");
	add("{\"term\":\"diffidence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07538525\"]}");
	add("{\"term\":\"difflugia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01397412\"]}");
	add("{\"term\":\"diffraction\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11467030\"]}");
	add("{\"term\":\"diffuseness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05095852\"]}");
	add("{\"term\":\"diffuser\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03199496\", \"03199676\"]}");
	add("{\"term\":\"diffusion\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00369400\", \"05095263\", \"07346200\", \"13486733\"]}");
	add("{\"term\":\"diffusor\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03199496\", \"03199676\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }