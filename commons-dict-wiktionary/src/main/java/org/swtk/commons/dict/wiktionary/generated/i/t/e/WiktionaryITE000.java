package org.swtk.commons.dict.wiktionary.generated.i.t.e;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryITE000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("item", "{\"term\":\"item\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"The word started as Latin \u0027item\u0027 for \u0026quot;also\u0026quot;, \u0026quot;in the same manner\u0026quot;, and got its present English meaning from a misunderstanding of its usage in lists, where the first entry would begin \u0026quot;In primis\u0026quot; (Latin for \u0026quot;firstly\u0026quot;), and the other entries with \u0026quot;Item\u0026quot; (Latin for \u0026quot;also\u0026quot;), in former times when most learned people in England knew Latin.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A distinct physical object\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"title\u003d[http://www.theguardian.com/world/2013/jul/23/mexico-insect-cuisine-sustainable-food Mexico gets a taste for eating passage\u003dThe San Juan market is Mexico City\u0027s most famous deli of exotic meats, where an adventurous shopper can hunt down hard-to-find critters\u0026amp;nbsp;. But the priciest \u0027\u0027items\u0027\u0027 in the market aren\u0027t the armadillo steaks or even the bluefin tuna\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A line of text having a legal or other meaning; a separate particular in an account\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A question on a test, which may include its answers\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"A matter for discussion in an agenda\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"Two people who are having a relationship with each other\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"2010\u0027\u0027, featuring , \u0027w:Baby (Justin Bieber Bab\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"Are we an \u0027\u0027item\u0027\u0027? Girl, quit playin\u0027 / \u0026quot;We\u0027re just friends,\u0026quot; what are you sayin\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"A short article in a newspaper\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"A hint; an innuendo\", \"priority\":10},{\"upperType\":\"NOUN\", \"text\":\"1606-1661\", \"priority\":11},{\"upperType\":\"NOUN\", \"text\":\"A secret \u0027\u0027item\u0027\u0027 was given to some of the bishops to absent themselves\", \"priority\":12}]}, \"synonyms\":{}}");

	add("itemizer", "{\"term\":\"itemizer\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|itemize|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"That which itemizes\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2008\u0027\u0027, B. T. Sue Atkins, ‎Michael Rundell, \u0027The Oxford Guide to Practical Lexicography\u0027 (page 323\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"the functions it performs in the language, as for instance an \u0027\u0027itemizer\u0027\u0027 of mass nouns or a collective of plural nouns, a support verb, etc\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"One who makes itemized deductions on a tax return\", \"priority\":4}]}, \"synonyms\":{}}");

	add("iteration", "{\"term\":\"iteration\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"From Latin {{m|la|iterātiō}}, from {{m|la|iterō}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Recital or performance a second time; repetition\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A variation or version\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The architect drafted several \u0027\u0027iterations\u0027\u0027 of the floorplan before deciding on his final design\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2014\u0027\u0027, \u0026quot;Jazz at Lincoln Center\u0026quot;, Radio New Zealand Schedule for Saturday 6th December [http://www.radionz.co.nz/concert/schedules/20141206\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Still going strong in his ninth decade, Wein celebrates his 88th birthday behind the piano accompanied by the latest \u0027\u0027iteration\u0027\u0027 of his band, the Newport All-Stars, featuring tenor saxophonist\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"the use of repetition in a computer program, especially in the form of a loo\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"a single repetition of the code within such a repetitive proces\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"The code calculates the appropriate value at each \u0027\u0027iteration\", \"priority\":8}]}, \"synonyms\":{}}");

	add("iterator", "{\"term\":\"iterator\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|iterate|or|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One which iterates\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A method capable of performing the same action on every item in a collection\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }