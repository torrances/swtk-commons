package org.swtk.commons.dict.wordnet.index.name.instance.p.h.e.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePHEN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"phenacetin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02678208\"]}");
	add("{\"term\":\"phenacomys\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02345186\"]}");
	add("{\"term\":\"phenaphen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02677336\"]}");
	add("{\"term\":\"phenazopyridine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03927459\"]}");
	add("{\"term\":\"phencyclidine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03927621\"]}");
	add("{\"term\":\"phenelzine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03927871\"]}");
	add("{\"term\":\"phenergan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04016724\"]}");
	add("{\"term\":\"phenicia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08939466\"]}");
	add("{\"term\":\"pheniramine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03928037\"]}");
	add("{\"term\":\"phenobarbital\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04263262\"]}");
	add("{\"term\":\"phenobarbitone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04263262\"]}");
	add("{\"term\":\"phenol\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14820243\", \"15014112\"]}");
	add("{\"term\":\"phenolic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14926778\"]}");
	add("{\"term\":\"phenolphthalein\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03928231\"]}");
	add("{\"term\":\"phenomenology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06176822\"]}");
	add("{\"term\":\"phenomenon\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07438418\", \"00034512\"]}");
	add("{\"term\":\"phenoplast\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14926778\"]}");
	add("{\"term\":\"phenothiazine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14795804\"]}");
	add("{\"term\":\"phenotype\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04941029\"]}");
	add("{\"term\":\"phensuximide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03928534\"]}");
	add("{\"term\":\"phentolamine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03928683\"]}");
	add("{\"term\":\"phenylacetamide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02677766\"]}");
	add("{\"term\":\"phenylalanine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15006138\"]}");
	add("{\"term\":\"phenylamine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14778684\"]}");
	add("{\"term\":\"phenylbutazone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03928844\"]}");
	add("{\"term\":\"phenylephrine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03928985\"]}");
	add("{\"term\":\"phenylethylene\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14619723\"]}");
	add("{\"term\":\"phenylketonuria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14530977\"]}");
	add("{\"term\":\"phenylpropanolamine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03929126\"]}");
	add("{\"term\":\"phenyltoloxamine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03929351\"]}");
	add("{\"term\":\"phenytoin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03208125\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }