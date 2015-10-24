package org.swtk.commons.dict.wiktionary.generated.f.i.d;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryFID000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("fiddle", "{\"term\":\"fiddle\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"English\", \"middle english (1100-1500)\"], \"text\":\"From Middle english (1100-1500) \u0027fithele\u0027 () from Old english (ca. 450-1100) \u0027fiðele\u0027 () Cognate with Old High German {{m|goh|fidula}} (German \u0027fiedel\u0027 , Old Norse \u0027fiðla\u0027 (Icelandic \u0027fiðla\u0027 Danish \u0027fiddel\u0027 Norwegian \u0027fela\u0027 , Middle Dutch {{m|dum|vedele}} (Dutch \u0027veel\u0027 \u0027vedel\u0027 .{{rel-top|conjectural ancient etymology}}The ultimate source of the word is unknown. Some argue that the similarity in Germanic variations can be explained by adoption and subsequent corruption of a contemporary Latin word, {{m|la|vitula}} or {{m|la|vidula}}. This is known to have occurred with the Romance languages eg. \u0027viol\u0027 or \u0027viola\u0027 in French, Portuguese, Italian and Spanish. Others argue that the Germanic words have a uniquely Teutonic origin, but no earlier forms have been found.{{rel-bottom}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of various bowed string instruments, often used to refer to a violin when played in any of various traditional styles, as opposed to classical violin\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"When I play it like this, it\u0027s a fiddle; when I play it like that, it\u0027s a violin\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A kind of dock (\u0027Rumex pulcher\u0027) with leaves shaped like the musical instrument\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"An adjustment intended to cover up a basic flaw\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"That parameter setting is just a fiddle to make the lighting look right\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"A fraud; a scam\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"On board a ship or boat, a rail or batten around the edge of a table or stove to prevent objects falling off at sea. (Also \u0027fiddle rail\", \"priority\":7}]}, \"synonyms\":{}}");

	add("fiddlehead", "{\"term\":\"fiddlehead\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|fiddle|head|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The scroll-shaped decoration at the tip of a fiddle\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The furled fronds of a young fern harvested for food consumption\", \"priority\":2}]}, \"synonyms\":{}}");

	add("fiddleleaf", "{\"term\":\"fiddleleaf\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|fiddle|leaf|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A plant of the \u0027Nama\u0027 genus, especially\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Certain species of plants with leaves thought to be shaped liked like fiddles\", \"priority\":2}]}, \"synonyms\":{}}");

	add("fiddler", "{\"term\":\"fiddler\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|fiddle|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who plays the fiddle\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"One who fiddles\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"2005\u0027\u0027, Yasmin Alibhai-Brown, \u0027The drama of my life\u0027 (in \u0027The Independent\u0027 online, [http://www.independent.co.uk/arts-entertainment/theatre-dance/features/the-drama-of-my-life-483792.html\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"We were the self-controlled, cautious, nifty merchants, decorous \u0027\u0027fiddlers\u0027\u0027 of accounts, hoarders of wealth, excellent bribers, family and community creatures governed by manners\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"A burrowing crab of the genus \u0027Gelasimus\u0027, of many species. The male has one claw very much enlarged, and often holds it in a position similar to that in which a musician holds a fiddle\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"The common European sandpiper (\u0027Tringoides hypoleucus\u0027); so called because it continually oscillates its body\", \"priority\":6}]}, \"synonyms\":{}}");

	add("fideism", "{\"term\":\"fideism\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"From Latin \u0027fides\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"the doctrine that faith is the basis of all knowledg\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1993\u0027\u0027: We were warned at Cambridge, your grace, of the dangers of what is termed \u0027\u0027fideism\u0027\u0027. — Anthony Burgess, \u0027A Dead Man in Deptford\", \"priority\":2}]}, \"synonyms\":{}}");

	add("fidepromissor", "{\"term\":\"fidepromissor\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"From Latin {{m|la|fidēprōmissor||guarantor, surety}}, from {{suffix|nocat\u003d1|fidēprōmittō|tor|t1\u003dmake a promise on behalf of another person, stand as guarantor or surety|lang\u003dla}}, from {{compound|nocat\u003d1|fidē|prōmittō|t1\u003din faith|t2\u003dpromise|lang\u003dla}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who pledges himself as security for another; bail, surety\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }