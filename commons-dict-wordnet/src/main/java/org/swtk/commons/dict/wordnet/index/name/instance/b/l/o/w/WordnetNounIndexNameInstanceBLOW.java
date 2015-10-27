package org.swtk.commons.dict.wordnet.index.name.instance.b.l.o.w;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBLOW {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"blow\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"00837162\", \"03070747\", \"11485416\", \"07313600\", \"07491010\", \"07353281\", \"01175528\"]}");
	add("{\"term\":\"blowback\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06647629\", \"07423565\"]}");
	add("{\"term\":\"blowball\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12044645\"]}");
	add("{\"term\":\"blower\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02065083\", \"03276485\", \"02858369\"]}");
	add("{\"term\":\"blowfish\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02657650\", \"07797948\"]}");
	add("{\"term\":\"blowfly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02194425\"]}");
	add("{\"term\":\"blowgun\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02858533\"]}");
	add("{\"term\":\"blowhard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09891532\"]}");
	add("{\"term\":\"blowhole\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04533536\", \"05257902\"]}");
	add("{\"term\":\"blowing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13460980\"]}");
	add("{\"term\":\"blowjob\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00856930\"]}");
	add("{\"term\":\"blowlamp\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02858670\"]}");
	add("{\"term\":\"blowout\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00519725\", \"07333218\", \"07490247\"]}");
	add("{\"term\":\"blowpipe\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02858533\", \"02858840\"]}");
	add("{\"term\":\"blowtorch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02858670\"]}");
	add("{\"term\":\"blowtube\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02858533\", \"02858840\"]}");
	add("{\"term\":\"blowup\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03294373\", \"07027434\", \"07323181\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }