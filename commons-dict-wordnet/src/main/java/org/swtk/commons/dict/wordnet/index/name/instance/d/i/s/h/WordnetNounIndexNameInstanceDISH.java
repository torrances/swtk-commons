package org.swtk.commons.dict.wordnet.index.name.instance.d.i.s.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDISH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"dish\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00433821\", \"03212026\", \"10633512\", \"13789036\", \"07572999\", \"03211629\"]}");
	add("{\"term\":\"dishabille\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14481286\"]}");
	add("{\"term\":\"disharmony\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04992058\"]}");
	add("{\"term\":\"dishcloth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03212464\"]}");
	add("{\"term\":\"disheartenment\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07268482\", \"07558063\"]}");
	add("{\"term\":\"dishful\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13789036\"]}");
	add("{\"term\":\"dishonesty\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00750872\", \"04881867\"]}");
	add("{\"term\":\"dishonor\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04881134\", \"14462913\"]}");
	add("{\"term\":\"dishonorableness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04880745\"]}");
	add("{\"term\":\"dishonour\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04881134\", \"14462913\"]}");
	add("{\"term\":\"dishonourableness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04880745\"]}");
	add("{\"term\":\"dishpan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03212269\"]}");
	add("{\"term\":\"dishrag\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03212464\"]}");
	add("{\"term\":\"dishtowel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03212556\"]}");
	add("{\"term\":\"dishware\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03138189\"]}");
	add("{\"term\":\"dishwasher\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10036908\", \"03212662\"]}");
	add("{\"term\":\"dishwashing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00256467\"]}");
	add("{\"term\":\"dishwater\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14861021\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }