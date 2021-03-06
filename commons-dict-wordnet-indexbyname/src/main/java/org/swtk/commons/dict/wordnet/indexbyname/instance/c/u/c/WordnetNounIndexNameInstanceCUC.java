package org.swtk.commons.dict.wordnet.indexbyname.instance.c.u.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCUC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cucking stool\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03149648\"]}");
	add("{\"term\":\"cuckold\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10001682\"]}");
	add("{\"term\":\"cuckoldom\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13990057\"]}");
	add("{\"term\":\"cuckoldry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00161742\"]}");
	add("{\"term\":\"cuckoo\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01825654\", \"10177319\"]}");
	add("{\"term\":\"cuckoo bread\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12723950\"]}");
	add("{\"term\":\"cuckoo clock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03149813\"]}");
	add("{\"term\":\"cuckoo flower\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11832175\", \"11902543\"]}");
	add("{\"term\":\"cuckooflower\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11902543\"]}");
	add("{\"term\":\"cuckoopint\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11800617\"]}");
	add("{\"term\":\"cuculidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01825414\"]}");
	add("{\"term\":\"cuculiform bird\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01825243\"]}");
	add("{\"term\":\"cuculiformes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01825064\"]}");
	add("{\"term\":\"cuculus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01825920\"]}");
	add("{\"term\":\"cuculus canorus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01826055\"]}");
	add("{\"term\":\"cucumber\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07734217\", \"12185901\"]}");
	add("{\"term\":\"cucumber tree\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11731296\"]}");
	add("{\"term\":\"cucumber vine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12185901\"]}");
	add("{\"term\":\"cucumis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12184732\"]}");
	add("{\"term\":\"cucumis melo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12184880\"]}");
	add("{\"term\":\"cucumis melo cantalupensis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12185173\"]}");
	add("{\"term\":\"cucumis melo inodorus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12185398\"]}");
	add("{\"term\":\"cucumis melo reticulatus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12185687\"]}");
	add("{\"term\":\"cucumis sativus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12185901\"]}");
	add("{\"term\":\"cucurbit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12178194\"]}");
	add("{\"term\":\"cucurbita\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12178665\"]}");
	add("{\"term\":\"cucurbita argyrosperma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12182698\"]}");
	add("{\"term\":\"cucurbita foetidissima\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12182942\"]}");
	add("{\"term\":\"cucurbita maxima\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12181573\", \"12182261\"]}");
	add("{\"term\":\"cucurbita maxima turbaniformis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12181802\"]}");
	add("{\"term\":\"cucurbita mixta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12182698\"]}");
	add("{\"term\":\"cucurbita moschata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12182486\"]}");
	add("{\"term\":\"cucurbita pepo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12178960\"]}");
	add("{\"term\":\"cucurbita pepo melopepo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12179572\"]}");
	add("{\"term\":\"cucurbitaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12177793\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }