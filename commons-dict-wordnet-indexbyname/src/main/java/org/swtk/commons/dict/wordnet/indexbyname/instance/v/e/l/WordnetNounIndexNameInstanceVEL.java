package org.swtk.commons.dict.wordnet.indexbyname.instance.v.e.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceVEL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"vela\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09493473\"]}");
	add("{\"term\":\"velar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07134733\"]}");
	add("{\"term\":\"velar consonant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07134733\"]}");
	add("{\"term\":\"velazquez\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11382324\"]}");
	add("{\"term\":\"velban\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04542929\"]}");
	add("{\"term\":\"velcro\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04531889\"]}");
	add("{\"term\":\"veld\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08695162\"]}");
	add("{\"term\":\"veldt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08695162\"]}");
	add("{\"term\":\"velleity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05660688\", \"07501667\"]}");
	add("{\"term\":\"vellication\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14385069\"]}");
	add("{\"term\":\"vellum\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14783326\", \"15111951\"]}");
	add("{\"term\":\"velocipede\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04489649\", \"04532011\"]}");
	add("{\"term\":\"velociraptor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01720108\"]}");
	add("{\"term\":\"velocity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15307914\"]}");
	add("{\"term\":\"velodrome\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04532128\"]}");
	add("{\"term\":\"velour\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04532236\"]}");
	add("{\"term\":\"velours\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04532236\"]}");
	add("{\"term\":\"veloute\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07856003\"]}");
	add("{\"term\":\"velum\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05316917\", \"13115315\"]}");
	add("{\"term\":\"velveeta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07871293\"]}");
	add("{\"term\":\"velvet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04532333\"]}");
	add("{\"term\":\"velvet ant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02217425\"]}");
	add("{\"term\":\"velvet bean\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12570913\"]}");
	add("{\"term\":\"velvet bent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12127519\"]}");
	add("{\"term\":\"velvet bent grass\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12127519\"]}");
	add("{\"term\":\"velvet flower\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11844041\"]}");
	add("{\"term\":\"velvet grass\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12143242\"]}");
	add("{\"term\":\"velvet osier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12751789\"]}");
	add("{\"term\":\"velvet plant\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11995723\", \"12909666\"]}");
	add("{\"term\":\"velvet sumac\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12784962\"]}");
	add("{\"term\":\"velvet worm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02002421\"]}");
	add("{\"term\":\"velveteen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04532486\"]}");
	add("{\"term\":\"velvetleaf\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12193586\", \"12203132\"]}");
	add("{\"term\":\"velvetweed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12193586\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }